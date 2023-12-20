import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 017�F���.
 * ����long�^�̕ϐ��̎Q�Ƃ�100���񂷂邾���̃X���b�hA�ƁA
 * ���̓����ϐ���0��-1���ǂ��炩�������邱�Ƃ�100����J��Ԃ��X���b�hB�𓯎��ɓ��삳���A
 * �X���b�hA�ł͂��̕ϐ��̒l���Q�Ƃ����Ƃ��ɕK��0�܂���-1�ƂȂ�悤�ɂ���v���O��������������.
 * 
 * @author toastkidjp
 */
public class Knock017 {

    /** ���[�v��. */
    private static final int COUNT = 1_000_000;

    /** ���� long �ϐ�. */
    private static volatile long variable = -1L;

    /**
     * main method.
     * @param args
     */
    public static void main(final String[] args) throws InterruptedException {
        // �����X���b�h�̏I���𓯊�����d�g��.
        final CountDownLatch latch = new CountDownLatch(2);
        final ExecutorService es = Executors.newFixedThreadPool(2);

        // �X���b�hA
        es.submit(() -> {
            for (int i = 0; i < COUNT; i++) {
                assert variable == 0 || variable == -1
                    : String.format("variable (%d) is not 0 or -1.", variable);
            }
            latch.countDown();
        });

        // �X���b�hB
        es.submit(() -> {
            for (int i = 0; i < COUNT; i++) {
                variable = (variable == 0) ? -1L : 0L;
            }
            latch.countDown();
        });

        // A, B �����̏I���܂őҋ@.
        latch.await();
        es.shutdown();
    }
}
