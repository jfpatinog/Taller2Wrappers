package com.clases;

import java.util.ArrayList;

public class BeneficiosCovid19 {
    
	private String id;
    private String nombre;
    private Float valorSubsidio;

    public char[] getId() {
        return id.toCharArray();
    }

    public void setId(String id) {
        this.id = id;
    }

    public char[] getNombre() {
        return nombre.toCharArray();
    }

    public void setNombre(String nombre) {
    	char[] aux = nombre.toCharArray();
        this.nombre = String.valueOf(aux);
    }

    public float getValorSubsidio() {
        return valorSubsidio.floatValue();
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }
  
    public BeneficiosCovid19() {}
    
    public BeneficiosCovid19(String id, String nombre, float valorSubsidio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valorSubsidio = valorSubsidio;
	}

	//Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public char[] getMejorbeneficio(ArrayList<BeneficiosCovid19> LtsBenef){
    	char[] id = new char[]{};
    	float vlr = LtsBenef.get(0).getValorSubsidio();
    	for(BeneficiosCovid19 bean: LtsBenef){
    		if(vlr < bean.getValorSubsidio()) {
    			id = bean.getId();
    			vlr = bean.getValorSubsidio();
    		}
    	}
        return id;
       
    }

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", valorSubsidio=" + valorSubsidio;
	}
    
}