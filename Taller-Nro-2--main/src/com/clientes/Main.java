package com.clientes;

import java.util.ArrayList;

import com.clases.BeneficiosCovid19;

public class Main {

	// Declaración Global
	static ArrayList<BeneficiosCovid19> LtsBenef = new ArrayList<>();
	static ArrayList<BeneficiosCovid19> LtsBenef2 = new ArrayList<>();
	static BeneficiosCovid19 BeanBenef = new BeneficiosCovid19();

	public static void main(String[] args) {

		// LISTA UNO
		LtsBenef.add(registrarBeneficio("Juan", 5000F));
		LtsBenef.add(registrarBeneficio("Luis", 6000F));
		LtsBenef.add(registrarBeneficio("Santiago", 1000F));
		LtsBenef.add(registrarBeneficio("Esteban", 9000F));
		LtsBenef.add(registrarBeneficio("Marcos", 90000F));
		LtsBenef.add(registrarBeneficio("Pruebs", 902200F));

		// LISTA DOS
		LtsBenef2.add(registrarBeneficioV2("Prueba2", 421F));
		LtsBenef2.add(registrarBeneficioV2("Carlos", 40F));
		LtsBenef2.add(registrarBeneficioV2("Jairo", 90F));
		LtsBenef2.add(registrarBeneficioV2("Ximena", 1F));
		LtsBenef2.add(registrarBeneficioV2("Catalina", 594F));
		LtsBenef2.add(registrarBeneficioV2("Laurent", 271F));

		imprimirRegistros();
		char[] idBenficio = mejorBeneficioLt1();
		char[] idBeneficio2 = mejorBeneficioLt2();
		BeneficiosCovid19 bean1 = new BeneficiosCovid19();
		BeneficiosCovid19 bean2 = new BeneficiosCovid19();
		
		bean1 = BuscarBenficio(idBenficio);
		bean2 = BuscarBenficioV2(idBeneficio2);
		
		if(bean1.getValorSubsidio() >= bean2.getValorSubsidio()) {
			System.out.println("El mejor Beneficio es:: " + bean1.toString());
		}else
			System.out.println("El mejor Beneficio es:: " + bean2.toString());
		
		
	}
	
	private static BeneficiosCovid19 BuscarBenficio(char[] id){
		for(BeneficiosCovid19 bean: LtsBenef) {
			if(Integer.parseInt(new String(bean.getId())) == Integer.parseInt(new String(id))) {
				return bean;
			}
		}
		return new BeneficiosCovid19();
	}
	
	private static BeneficiosCovid19 BuscarBenficioV2(char[] id){
		for(BeneficiosCovid19 bean: LtsBenef2) {
			if(Integer.parseInt(new String(bean.getId())) == Integer.parseInt(new String(id))) {
				return bean;
			}
		}
		return new BeneficiosCovid19();
	}
	
	private static char[] mejorBeneficioLt1() {
		char[] id = new BeneficiosCovid19().getMejorbeneficio(LtsBenef);
		return id;
	}

	private static char[] mejorBeneficioLt2() {
		char[] id = new BeneficiosCovid19().getMejorbeneficio(LtsBenef2);
		return id;
	}
	private static BeneficiosCovid19 registrarBeneficio(String nombre, Float valor) {
		BeneficiosCovid19 bean = new BeneficiosCovid19();
		bean.setId(getIdBeneficio());
		bean.setNombre(nombre);
		bean.setValorSubsidio(valor);
		return bean;

	}

	private static BeneficiosCovid19 registrarBeneficioV2(String nombre, Float valor) {
		return new BeneficiosCovid19(getIdBeneficio(), nombre, valor);
	}

	/**
	 * Implementa un metodo que entregue un reporte de comparacion de las 2 listas
	 * este metodo solo imprimira regiostros Cuando un metodo no retorna un tipo de
	 * datos se trabaja con la palabra clave VOID Abarcar los operadores terniarios
	 * para condiciones logicas Operadores logicos Operacionres aritmeticos
	 **/
	public static void imprimirRegistros() {

		//Lista UNO
		System.out.println("Lista1 de Beneficios COVID 19");
		for (int i = 0; i < LtsBenef.size(); i++) {
			System.out.println("->" + LtsBenef.get(i));
		}
		
		System.out.println("Lista2 de Beneficios COVID 19");
		for(BeneficiosCovid19 bean: LtsBenef2)
			System.out.println("->" + bean.toString());
		
	}

	private static String getIdBeneficio() {
		return Integer.toString((int) (Math.random()*1000000+10000));
	}
}
