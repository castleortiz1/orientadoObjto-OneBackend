package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Pelicula muy bien evaluada de momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Pelicula en ascenso para ser popular");
        }else {
            System.out.println("Coloca esta pelicula en tu lista de favorito");

        }

    }

}
