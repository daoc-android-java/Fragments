package com.example.testswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 *El adaptador crea y devuelve cada p�gina (fragmento)
 */
public class Adaptador extends FragmentPagerAdapter {

	public Adaptador(FragmentManager fm) {
		super(fm);
	}

	@Override
	//Inicializa el fragmento correspondiente a cada una de las p�ginas,
	//dependiendo de su posici�n
	public Fragment getItem(int position) {
		Fragment fragment = new Pagina(position);
		return fragment;
	}

	@Override
	//Indica el n�mero total de p�ginas existentes
	public int getCount() {
		return 3;
	}

}