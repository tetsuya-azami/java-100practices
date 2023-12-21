import java.util.ArrayList;
import java.util.List;

/**
 * 020�F�W�F�l���N�X.
 * �ȉ��̔z��`MEDALS`�ɂ��āA�W�F�l���N�X��p�����ꍇ�̃��X�g�Ɨp���Ȃ��ꍇ�̃��X�g�ɂ��ꂼ��v�f�����A
 * ���ꂼ��̃��X�g�ɂ��āA�S�v�f�����Ԃɏo�͂��邽�߂̃v���O��������������.
 *
 * <pre>
 * private static final String[] MEDALS = new String[]{
 *    "GOLD", "SILVER", "BRONZE"
 * };
 * </pre>
 *
 * @author toastkidjp
 *
 */
public class Knock020 {

    /** Medals. */
    private static final String[] MEDALS = new String[]{
       "GOLD", "SILVER", "BRONZE"
    };

    /**
     * main method.
     * @param args
     */
    public static void main(final String[] args) throws InterruptedException {
        withGeneric();
        withoutGeneric();
    }

    /**
     * �W�F�l���N�X����̃��X�g���g�����ꍇ.
     */
    private static void withGeneric() {
        final List<String> medals = new ArrayList<String>(MEDALS.length);

        for (final String medal : MEDALS) {
            medals.add(medal);
        }

        for (final String medal : medals) {
            System.out.println(medal);
        }
    }

    /**
     * �W�F�l���N�X�Ȃ��̃��X�g���g�����ꍇ.
     */
    private static void withoutGeneric() {
        final List medals = new ArrayList(MEDALS.length);

        for (final Object medal : MEDALS) {
            medals.add(medal);
        }

        for (final Object medal : medals) {
            System.out.println(medal);
        }
    }
}
