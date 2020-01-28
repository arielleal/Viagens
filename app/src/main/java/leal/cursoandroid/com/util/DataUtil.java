package leal.cursoandroid.com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    public static String periodoEmTexto(int dias) {
        Calendar dataDeIda = Calendar.getInstance();
        Calendar dataDeVolta = Calendar.getInstance();
        dataDeVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormatadaIda = formatoBrasileiro.format(dataDeIda.getTime());
        String dataFormatadaVolta = formatoBrasileiro.format(dataDeVolta.getTime());
        return dataFormatadaIda + " - " + dataFormatadaVolta + " de " + dataDeVolta.get(Calendar.YEAR);
    }
}
