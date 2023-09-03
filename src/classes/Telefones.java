package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Telefones {

    private Properties properties;
    private String filePath;

    public Telefones(String filePath) {
        this.filePath = filePath;
        properties = new Properties();
        loadFromFile();
    }

    public void adicionarNumeroCelular(String numero) {
        properties.setProperty("numeroCelular" + (properties.size() + 1), numero);
        saveToFile();
    }

    public void listarNumerosCelular() {
        for (String key : properties.stringPropertyNames()) {
            String numero = properties.getProperty(key);
            System.out.println(numero);
        }
    }

    private void loadFromFile() {
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        try (OutputStream output = new FileOutputStream(filePath)) {
            properties.store(output, "Números de Celular");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
