package com.accenture.rentacar.app.util;

import java.sql.Date;
import java.time.DateTimeException;

public class UtilDate { //FINAL, ABSTRACTA  PUBLIC; VOID NO! * FINAL; Hereda, pero nadie hereda de ella, public final class extends UtilDate

	public static final double VALOR_PI = 3.1416; //Las variables de tipo constante se declaran el MAY
	
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		try {

			long diferencia = fechaFin.getTime() - fechaInicio.getTime();
			Long d = (diferencia / (1000*60*60*24)); //Long d = (diferencia / (0))
			int dias = d.intValue();
			return dias;
			//return d.intValue();
		}
		catch(DateTimeException e) { //E; Variable **
			throw e;
			//System.err.println(e);
		}
		catch(Exception e){
			throw e;
		}
		
	}
}
