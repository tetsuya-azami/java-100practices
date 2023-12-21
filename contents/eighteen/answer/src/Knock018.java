/**
 * 018�F�񋓌^.
 * ���j�[�N�Ȗ��O��ID�������A���O��ID�ǂ���ł��C���X�^���X���擾�ł���enum����������.
 *   * ��Ƃ��āA�\��x��\������enum����������.
 * 
 * @author toastkidjp
 */
public class Knock018 {

    /**
     * �\��x��\������ enum.
     *
     */
    private enum EarthlyBranches {
        NE("�q", 1), USHI("�N", 2), TRA("��", 3), U("�K", 4), TATSU("�C", 5), MI("��", 6),
        HITSUJI("��", 7), UMA("��", 8), SARU("�\", 9), TORI("��", 10), INU("��", 11), I("��", 12);

        /** �\��x�̓��{��. */
        private final String text;

        /** ID */
        private final int id;

        /**
         * private constructor.
         * @param text �\��x�̓��{��
         * @param id   ID
         */
        private EarthlyBranches(final String text, final int id) {
            this.text = text;
            this.id   = id;
        }

        /**
         * ID �� EarthlyBranches �C���X�^���X���擾����.
         * @param id
         * @return ID �ɑΉ����� EarthlyBranches �C���X�^���X
         */
        public static EarthlyBranches findById(final int id) {
            for (final EarthlyBranches eb : EarthlyBranches.values()) {
                if (eb.id == id) {
                    return eb;
                }
            }
            return null;
        }

        /**
         * ���O �� EarthlyBranches �C���X�^���X���擾����.
         * @param text ���O
         * @return ���O�ɑΉ����� EarthlyBranches �C���X�^���X
         */
        public static EarthlyBranches findByText(final String text) {

            if (text == null) {
                return null;
            }

            for (final EarthlyBranches eb : EarthlyBranches.values()) {
                if (eb.text.equals(text)) {
                    return eb;
                }
            }
            return null;
        }
    }

    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(EarthlyBranches.findById(1).text);
        System.out.println(EarthlyBranches.findByText("�\").text);
    }

}
