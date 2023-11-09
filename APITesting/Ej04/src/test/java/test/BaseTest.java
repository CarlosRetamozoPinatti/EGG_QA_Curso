package test;

import api.APIConfig;

public abstract class BaseTest {
    // Construir la URL completa primero.
    String apiUrl = APIConfig.BASE_URL + APIConfig.USER_ENDPOINT;
    String apiUrl2 = APIConfig.BASE_URL + APIConfig.TRANSACTION_ENDPOINT;
}
