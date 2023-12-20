import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 017�̉𓚂ł��B
 *
 * @author jsfkdt
 */
public class Answer017 {

    /** ���[�v��. */
    private static final int COUNT = 1_000_000;

    /** ���� long �ϐ�. */
    private static volatile long variable = -1L;
    
    /**
     * 017�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) throws InterruptedException {
        // �����X���b�h�̏I���𓯊�����d�g��
        final CountDownLatch latch = new CountDownLatch(2); // �X���b�h��2�Ƃ��I������܂ő҂��߂̃N���X.
        final ExecutorService es = Executors.newFixedThreadPool(2); // 2�̃X���b�h����񏈗������邽�߂̃N���X.
        final AtomicLong atom = new AtomicLong(); // long�^�ϐ����A�g�~�b�N�Ȓl�ɐݒ肷�邽�߂̃N���X.

        // �X���b�hA.
        es.submit(() -> {
            for (int i = 0; i < COUNT; i++) {
                
                /** �]���p�̕ϐ� **/
                long atomicVariable;
    
                // �Q�ƒl���A�g�~�b�N�Ȓl�ɐݒ�.
                atom.set(variable);
                
                // �Q�ƒl��]���p�ϐ��ɑ��.
                atomicVariable = atom.get();
                
                // �ϐ���0�ł�-1�ł��Ȃ��ꍇ�ɂ��̓��e���o��.
                if (atomicVariable != 0 && atomicVariable != -1) {
                    System.out.printf("variable (%d) is not 0 or -1.\n", atomicVariable);
                }
            }
            
            // �X���b�hA���I���������Ƃ��J�E���g�֔��f.
            latch.countDown();
        });

        // �X���b�hB.
        es.submit(() -> {
            for (int i = 0; i < COUNT; i++) {
                // �ϐ���0�̏ꍇ-1L�������A����ȊO�̏ꍇ��0L��������.
                if (variable == 0) {
                    variable = -1L;
                } else {
                    variable = 0L;
                }
            }
            // �X���b�hB���I���������Ƃ��J�E���g�֔��f.
            latch.countDown();
        });
        
        // A, B �����̏I���܂őҋ@.
        latch.await();
        es.shutdown();
    }
}
