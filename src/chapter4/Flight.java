//package chapter4;
//
//public class Flight {
//
//    private String FlightName = "Comando da biblioteca de excel para ler na planilha a celula com nome do voo";
//
//    //Substituir o findBy por um comando que captura todos elementos achados pelo seletor xpath abaixo
//    @FindBy(xpath = "//td[contains(@class, 'data_left')]/font/b").GetCount
//    private WebElement Quant;
//
//    //Cria um loop para iterar sobre a variavel quant que veio da linha acima
//    //para capturar os textos de todos os voos na pagina e armazenar em um array
//    for(int i=0; i<Quant; i++){
//        private String names[] = FindElementByXpath("(//td[contains(@class, 'data_left')]/font/b)" + [i]).GetText;
//    }
//    //Neste segundo loop iterar sobre o array que tem os nomes de voo vindos da pagina web e comparar com a variavel
//    //FlightName que recebeu o voo pesquisado la na planilha
//    //Se for igual o valor na posicao do array ao da variavel, ele clicar na tag td anterior a do nome do voo que
//    //e o campo input
//    for (String value : names){
//        if (value == FlightName){
//            FindElementByXpath("((//td[contains(@class, 'frame_action_xrows')]/input)"[value] + [i]).click;
//        }
//    }

}
