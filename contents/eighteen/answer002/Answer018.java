/**
 * 018����.
 * 
 * @author jsfkdt
 */
public class Answer018 {
    
    private enum ZodiacSigns {
        NE("�q", 1), USHI("�N", 2), TORA("��", 3), U("�K", 4), TATSU("�C", 5), MI("��", 6),
        HITSUJI("��", 7), UMA("��", 8), SARU("�\", 9), TORI("��", 10), INU("��", 11), I("��", 12);
        
        /** �\��x�̖��O. */
        private final String name;
        
        /** �ŗL��ID. */
        private final int id;
        
        /**
         * �\��x�̖��O��ID��ݒ肷��.
         *
         * @param name �\��x�̖��O
         * @param id   �ŗL��ID
         */
        private ZodiacSigns(final String name, final int id) {
            this.name = name;
            this.id = id;
        }
        
        // �\��x�̖��O���擾����.
        public String getName() {
            return name;
        }
        
        // �ŗL��ID���擾����.
        public int getId() {
            return id;
        }
        
        /**
         * �ŗL��ID�ɕR�t���\��x�̃C���X�^���X���擾����.
         *
         * @param  id  �ŗL��ID
         * @return �Y����ID�ɕR�t���\��x�̃C���X�^���X. �Y�����Ȃ��ꍇ��null.
         */
        public static ZodiacSigns getInstanceFromId(final int id) {
            for (final ZodiacSigns instance : ZodiacSigns.values()) {
                if (instance.id == id) {
                    return instance;
                }
            }
            return null;
        }
        
        /**
         * �\��x�̖��O�ɕR�t���C���X�^���X���擾����.
         *
         * @param  name  �\��x�̖��O
         * @return �Y���̖��O�ɕR�t���\��x�̃C���X�^���X. �Y�����Ȃ��ꍇ��null.
         */
        public static ZodiacSigns getInstanceFromName(final String name) {
            for (final ZodiacSigns instance : ZodiacSigns.values()) {
                if (instance.name == name) {
                    return instance;
                }
            }
            return null;
        }
    }

    /**
     * 018�̉𓚂ł�.
     * @param arguments �g�p���܂���.
     */
    public static void main(String[] args) {
        System.out.println(ZodiacSigns.getInstanceFromId(1));
        System.out.println(ZodiacSigns.getInstanceFromName("��"));
    }
}
