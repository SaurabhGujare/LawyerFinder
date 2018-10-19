package Common;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ninad Subhedar (NUID : 001472377)
 */
public class CommonUtils {
    
    private static final SimpleDateFormat MMddyyyyhhmm = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    
    public static String formatDateTime(Date date){
        if(date==null)
            return "";
        return MMddyyyyhhmm.format(date);
    }
}
