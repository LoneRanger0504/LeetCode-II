package SwordRefers2Offer;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        //�߽�����
        if (str.length() == 0) return "";
        StringBuffer res = new StringBuffer();
        String newStr = str.toString();
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(newStr.charAt(i));
            }
        }
        return res.toString();
    }
}
