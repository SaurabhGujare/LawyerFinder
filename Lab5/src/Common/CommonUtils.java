package Common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class CommonUtils {
    
    private static final SimpleDateFormat MMddyyyyhhmm = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    private static final String EMAIL_REGEX = "^([A-Za-z0-9])([A-Za-z0-9\\.\\-\\_\\$\\_])*\\@([A-Za-z0-9_\\-])+\\.([A-Za-z]{2,4})$";
    private static final String PASSWORD_REGEX = "([A-Za-z0-9+_$])*";
    private static final String BLANK = "";
    
    public static String formatDateTime(Date date){
        return date==null?BLANK:MMddyyyyhhmm.format(date);
    }
    
    public static boolean checkUserName(String username){
        return (username==null || username.equals(""))?true:Pattern.matches(EMAIL_REGEX, username);
    }
    
    public static boolean passwordPatternCorrect(String pwd){
        return Pattern.compile(PASSWORD_REGEX).matcher(pwd).matches();
    }
    
    public static boolean comparePasswords(char[] pwd, char[] pwd1){
        return new String(pwd).equals(new String(pwd1));
    }
}
