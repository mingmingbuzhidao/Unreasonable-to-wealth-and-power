
public class JinZhi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] byteData=new byte[]{0x00,0x61};
		char charData='a';	
		byte[] byteData1=charToByte(charData);
		System.out.println("下面是10进制表达： ");
		for(int i=0;i<2;i++) {
			System.out.println(byteData1[i]);
		}
		System.out.println("下面是16进制表达： ");
		for(int i=0;i<2;i++) {
			System.out.println(Integer.toHexString(byteData1[i]));
		}
		System.out.println("下面是16进制表达2： ");
		for(int i=0;i<2;i++) {
			System.out.println(Integer.toBinaryString(byteData1[i]));
		}
		System.out.println("----------------------------");
		System.out.println(bytesToChar(byteData));
		System.out.println(bytesToChar(byteData1));
	}
	
	public static char bytesToChar(byte[] b)
    {
        char c = (char) ((b[0] << 8) & 0xFF00L);
        c |= (char) (b[1] & 0xFFL);
        return c;
    }
	
	public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[0] = (byte) ((c & 0xFF00) >> 8);
        b[1] = (byte) (c & 0xFF);
        return b;
    }

}
