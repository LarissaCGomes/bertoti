public class Teste {
    public static void main(String[] args) {
        Animal passaro = new Animal(new MovimentoVoo()) {
            @Override
            public void exibir() {
                System.out.println("Pássaro");
            }
        };

        Animal helicoptero = new Animal(new MovimentoVoo()) {
            @Override
            public void exibir() {
                System.out.println("Helicóptero");
            }
        };

        passaro.exibir();
        passaro.mover();

        System.out.println();

        helicoptero.exibir();
        helicoptero.mover();
    }
}
