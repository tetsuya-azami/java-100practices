import java.util.ArrayList;
import java.util.List;
/**
 * 020�̉𓚂ł�.
 *
 * @author jsfkdt
 */
public class Answer020 {
    
    /** �w�肳�ꂽ�z�� **/
    private static final String[] MEDALS = new String[] {"GOLD", "SILVER", "BRONZE"};
    
    /**
     * 020�̉𓚂ł�.
     * �W�F�l���N�X��p�����ꍇ�Ɨp���Ȃ��ꍇ�A���ꂼ��ŗv�f��ǂݍ��݁A
     * ���ꂼ��̃��X�g�ɂ��āA�S�v�f�����Ԃɏo�͂���.
     * @param arguments �g�p���܂���.
     */
    public static void main(final String[] args) {
        
        
        /** �W�F�l���N�X��p�������X�g **/
        final List<String> genericList = new ArrayList<String>();
        
        /** �W�F�l���N�X��p���Ȃ����X�g **/
        final ArrayList nonGenericList = new ArrayList();
        
        // �w��̃��X�g�v�f���W�F�l���N�X��p�������X�g�֑��.
        for (final String medal : MEDALS) {
            genericList.add(medal);
        }
        
        // �W�F�l���N�X��p�������X�g�̗v�f�����Ԃɏo��.
        for (int i = 0; i < genericList.size(); i++) {
            System.out.println(genericList.get(i));
        }
        
        // �w��̃��X�g�v�f���W�F�l���N�X��p���Ȃ����X�g�֑��.
        for (String medal : MEDALS) {
            nonGenericList.add(medal);
        }
        
        // �W�F�l���N�X��p���Ȃ����X�g�̗v�f�����Ԃɏo��.
        for (int i = 0; i < nonGenericList.size(); i++) {
            System.out.println(nonGenericList.get(i));
        }
    }
    
}