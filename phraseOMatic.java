public class phraseOMatic {
public static void main(String[] args) {
    
String[] wordListOne = {"pessego","camadas","30.000 pés", "chocolate", "rabanada", "Bruna", "Humberto", "José", "Pedro", "GitHub", "Miley 'Citrus' ", "Nirvana", "Justin Biba","Amor", "telefone", "esperança", "escola", "mochila", "ventilador", "sorvete", "celular", "futebol", "dinheiro", "espelho", "janela", "cobertor", "caneta", "lápis"};

String[] wordListTwo = {"Abacaxi", "girassol", "avião", "relógio", "cachorro", "chocolate", "montanha", "lua", "violão", "elefante", "computador", "banana", "carro", "mar", "guitarra", "estrela", "maçã", "água", "piano", "flor"};

String[] wordListThree = {"Abóbora", "bicicleta", "castelo", "diamante", "eletricidade", "foguete", "girafa", "helicóptero", "iogurte", "jacaré", "kiwi", "limão", "macaco", "navio", "ocarina", "pássaro", "queijo", "raio", "sapato", "tartaruga"};

int oneLength = wordListOne.length;
int twoLength = wordListTwo.length;
int threeLength = wordListThree.length;

int rand1 = (int) (Math.random() * oneLength);
int rand2 = (int) (Math.random() * twoLength);
int rand3 = (int) (Math.random() * threeLength);

String phrase = wordListOne[rand1] + " , " + wordListTwo[rand2] + " e " + wordListThree[rand3];

System.out.println("Precisamos de: " + phrase );

}    
}