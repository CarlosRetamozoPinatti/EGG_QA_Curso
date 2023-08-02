package service;

import entity.Paises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisesService {
    private Paises paises;

    public PaisesService() {
        paises = new Paises();
    }

    public void agregarPaises(String pais) {
            if (paises.getPaises().contains(pais)) {
                System.out.println("El pais ya esta en la lista!..");
            } else {
                paises.getPaises().add(pais);
                System.out.println("País agregado: " + pais);
            }
    }

    public void visualizarPaises() {
        if (paises.getPaises().isEmpty()) {
            System.out.println("No hay países en la lista.");
        } else {
            System.out.println("Lista de países:");
            for (String pais : paises.getPaises()) {
                System.out.println(pais);
            }
        }
    }

    public void eliminarPaises(String pais) {
            if (paises.getPaises().contains(pais)){
                if (paises.getPaises().remove(pais)) {
                    System.out.println("País eliminado: " + pais);
                } else {
                    System.out.println("El país no existe en la lista.");
                }
            }
    }

    public void visualizarPaisesOrdenAZ() {
        Set<String> paisesOrdenadosAsc = new TreeSet<>(paises.getPaises());
        if (paisesOrdenadosAsc.isEmpty()) {
            System.out.println("No hay países en la lista.");
        } else {
            System.out.println("Lista de países ordenados alfabéticamente de A a Z:");
            for (String pais : paisesOrdenadosAsc) {
                System.out.println(pais);
            }
        }
    }

    public void visualizarPaisesOrdenZA() {
        Set<String> paisesOrdenadosDesc = new TreeSet<>((a, b) -> b.compareTo(a));
        paisesOrdenadosDesc.addAll(paises.getPaises());
        if (paisesOrdenadosDesc.isEmpty()) {
            System.out.println("No hay países en la lista.");
        } else {
            System.out.println("Lista de países ordenados alfabéticamente de Z a A:");
            for (String pais : paisesOrdenadosDesc) {
                System.out.println(pais);
            }
        }
    }
}