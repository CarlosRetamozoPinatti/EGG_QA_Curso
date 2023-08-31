package org.example.entity;

import org.example.enums.Apellidos;
import org.example.enums.Nombres;

import java.util.*;

public class Simulador {
    int nAlumnos = 30;

    public List<String> generarNombreCompleto() {
        List<String> nombres = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < nAlumnos; i++) {
            int j = random.nextInt(Nombres.values().length);
            String nombre = Nombres.values()[j].toString();

            int k = random.nextInt(Apellidos.values().length);
            String apellido = Apellidos.values()[k].toString();

            nombres.add(nombre + " " + apellido);
        }

        return nombres;
    }

    public List<Integer> generarDNI() {
        List<Integer> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < nAlumnos; i++) {
            int dni = random.nextInt(20000000, 45000000);
            while (dnis.contains(dni)) {
                dni = random.nextInt(20000000, 45000000);
            }
            dnis.add(dni);
        }

        return dnis;
    }

    public List<Alumno> generarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        List<String> nombres = generarNombreCompleto();
        List<Integer> dnis = generarDNI();

        for (int i = 0; i < nAlumnos; i++) {
            Alumno alumno = new Alumno();

            alumno.setNombre(nombres.get(i));
            alumno.setDNI(dnis.get(i));
            alumno.setVotos(0);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno a : alumnos) {
            System.out.println("(" + a.getDNI() + ") " + a.getNombre() + " - Votos: " + a.getVotos());
        }
    }

    public List<Voto> votacion(List<Alumno> alumnos) {
        List<Voto> votos = new ArrayList<>();
        Random random = new Random();

        for (Alumno votante : alumnos) {
            HashSet<Alumno> alumnosVotados = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                int posAlumnoVotado = random.nextInt(nAlumnos);
                Alumno alumnoVotado = alumnos.get(posAlumnoVotado);
                if ((alumnosVotados.contains(alumnoVotado)) || (alumnoVotado == votante)) {
                    continue;
                }
                alumnosVotados.add(alumnoVotado);
                alumnoVotado.setVotos(alumnoVotado.getVotos() + 1);
            }
            Voto voto = new Voto();
            voto.setAlumno(votante);
            voto.setAlumnoList(alumnosVotados);
            votos.add(voto);
        }
        return votos;
    }

    public void mostrarVotos(List<Voto> votos) {
        for (Voto voto : votos) {
            System.out.print(voto.getAlumno().getNombre() + " tiene " + voto.getAlumno().getVotos() + " votos y voto a ");
            for (Alumno a : voto.getAlumnoList()) {
                System.out.print(a.getNombre() + ", ");
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
        }
    }

    public Integer recuentoVotos(List<Alumno> alumnos) {
        Integer recuento = 0;
        for (Alumno a : alumnos) {
            recuento += a.getVotos();
        }
        return recuento;
    }

    public List<Alumno> getFacilitadores(List<Alumno> alumnos) {
        List<Alumno> facilitadores = new ArrayList<>();
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o2.getVotos().compareTo(o1.getVotos());
            }
        });
        for (int i = 0; i < 10; i++) {
            facilitadores.add(alumnos.get(i));
        }
        return facilitadores;
    }

    public void mostrarFacilitadores(List<Alumno> facilitadores) {
        for (Alumno a : facilitadores) {
            if (facilitadores.indexOf(a) < 5) {
                System.out.println(a.getNombre() + " es facilitador/a");
            } else {
                System.out.println(a.getNombre() + " es facilitador/a suplente");
            }
        }
    }
}