package com.mx.taller.java;
import java.rmi.RemoteException;

import com.mx.Saludo;
import com.mx.SaludoProxy;
import com.mx.everis.Sumas;
import com.mx.everis.SumasProxy;

public class Test {

	public static void main(String[] args) {
		Saludo s=new SaludoProxy();
		Sumas sm=new SumasProxy();
		try {
			s.sludar();
			sm.getSuma(2, 3);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

}
