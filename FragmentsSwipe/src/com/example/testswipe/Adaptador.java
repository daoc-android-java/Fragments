package com.example.testswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 *El adaptador crea y devuelve cada página (fragmento)
 */
public class Adaptador extends FragmentPagerAdapter {

	public Adaptador(FragmentManager fm) {
		super(fm);
	}

	@Override
	//Inicializa el fragmento correspondiente a cada una de las páginas,
	//dependiendo de su posición
	public Fragment getItem(int position) {
		Fragment fragment = new Pagina(position);
		return fragment;
	}

	@Override
	//Indica el número total de páginas existentes
	public int getCount() {
		return 3;
	}

}