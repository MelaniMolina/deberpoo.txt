public class Main {
    public static void main(String[] args) {
        Felinos cat = new Felinos();
        System.out.println("<<--- F-E-L-I-N-O-S !! --->>");
        System.out.println("Peso: "+cat.getPesofe()+" Kg");
        System.out.println("Tipo de raza: "+cat.getRazafe());
        System.out.println("Tamanio: "+cat.getTamanife()+" cm");
        System.out.println("Color del Gato: "+cat.getColorfe());
        System.out.println("\n");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        Felinos gato = new Felinos();
        System.out.println("\n");
        gato.setPesofe(5.5);
        System.out.println("Peso: "+gato.getPesofe()+" Kg");
        gato.setRazafe("Gato persa");
        System.out.println("Tipo de raza: "+gato.getRazafe());
        gato.setTamanife(23);
        System.out.println("Tamanio: "+gato.getTamanife()+" cm");
        gato.setColorfe("Naranja");
        System.out.println("Color del Gato: "+gato.getColorfe());
        System.out.println("\n");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        Felinos gatos = new Felinos();
        System.out.println("\n");
        gatos.setPesofe(4.5);
        System.out.println("Peso: "+gatos.getPesofe()+" Kg");
        gatos.setRazafe("Gato Chinchilla");
        System.out.println("Tipo de raza: "+gatos.getRazafe());
        gatos.setTamanife(26);
        System.out.println("Tamanio: "+gatos.getTamanife()+" cm");
        gatos.setColorfe("Gris");
        System.out.println("Color del Gato: "+gatos.getColorfe());
        System.out.println("\n");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        Felinos gatitos = new Felinos();
        System.out.println("\n");
        gatitos.setPesofe(6.5);
        System.out.println("Peso: "+gatitos.getPesofe()+" Kg");
        gatitos.setRazafe("Gato Maine Coon");
        System.out.println("Tipo de raza: "+gatitos.getRazafe());
        gatitos.setTamanife(48);
        System.out.println("Tamanio: "+gatitos.getTamanife()+" cm");
        gatitos.setColorfe("Negro");
        System.out.println("Color del Gato: "+gatitos.getColorfe());

    }


    }
