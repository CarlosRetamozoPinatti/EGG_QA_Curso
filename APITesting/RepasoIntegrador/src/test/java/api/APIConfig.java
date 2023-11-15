package api;
/*
 Esta clase se utiliza para configurar valores globales,
 como la URL base del servicio API.
 Actúa como una especie de punto central donde se definen parámetros
 que serán utilizados en toda la automatización de pruebas.
 */
public class APIConfig {
    public static final String BASE_URL = "https://swapi.dev/api";
    public static final String PEOPLE_ENDPOINT = "/people/";
    public static final String FILMS_ENDPOINT = "/films/";
    public static final String PLANETS_ENDPOINT = "/planets/";
    public static final String SPECIES_ENDPOINT = "/species/";
    public static final String STARSHIPS_ENDPOINT = "/starships/";
    public static final String VEHICLES_ENDPOINT = "/vehicles/";
}
