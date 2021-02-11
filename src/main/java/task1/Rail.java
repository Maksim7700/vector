package task1;

public class Rail {
    public static void main(String[] args) {
        String text = "helloworld";
        String st = getCipher(text, 3);
        String st1 = getDecriptCiper(st, 3);
        System.out.println(st);
        System.out.println(st1);
    }

    public static String getCipher(String text, int rails) {
        StringBuilder sb = new StringBuilder();
        int row = rails;
        int col = text.length();
        boolean isLast = false;
        int j = 0;

        char[][] chars = new char[row][col];
        for (int i = 0; i < col; i++) {
            if (j == 0 || j == rails - 1) {
                isLast = !isLast;
            }
            chars[j][i] = text.charAt(i);
            if (isLast) {
                j++;
            } else {
                j--;
            }
        }
        for (int i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (chars[i][j] != 0) {
                    sb.append(chars[i][j]);

                }
            }
        }
        return sb.toString();
    }

    public static String getDecriptCiper(String text, int rails) {
        StringBuilder sb = new StringBuilder();
        int row = rails;
        int col = text.length();
        boolean isLast = false;
        int j = 0;

        char[][] chars = new char[row][col];
        for (int i = 0; i < col; i++) {
            if (j == 0 || j == rails - 1) {
                isLast = !isLast;
            }
            chars[j][i] = '*';

            if (isLast) {
                j++;
            } else {
                j--;
            }
        }

        isLast = false;
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int c = 0; c < col; c++) {
                if (chars[i][c] == '*') {
                    chars[i][c] = text.charAt(index++);
                }
            }
        }
        j = 0;
        for (int i = 0; i < col; i++) {
            if (j == 0 || j == rails - 1) {
                isLast = !isLast;
            }
            sb.append(chars[j][i]);

            if (isLast) {
                j++;
            } else {
                j--;
            }
        }
        return sb.toString();
    }
}
