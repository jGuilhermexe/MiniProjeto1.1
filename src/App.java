import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("                                                  TURMA DA MÔNICA ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Tenha uma ótima experiência com Mônica, Magali, Cebolinha e Cascão!!\n");
        Thread.sleep(5000);
        System.out.println("Em um belo final de semana, Cebolinha planeja aproveitar seus dias sem aula para aproveitar da melhor forma possível!");
        System.out.println("Pensando nisso, Cebolinha está prestes a bolar mais um dos seus planos infalíveis para encher a paciência da Mônica.");
        System.out.println("Então, a primeira coisa que Cebolinha fez, foi ir até a casa do Cascão, seu melhor amigo.");
        System.out.println("Juntos, Cascão e Cebolinha seguem rumo a Casa da Árvore, para juntos bolarem algo divertido para fazer.\n");
        System.out.println("No caminho pra casa, Cebolinha e Cascão percebem que Mônica e Magali estão fazendo um piquenique no parque.");
        System.out.println("Cebolinha e Cascão se aconchegam na casa da árvore, e preparam caneta e papel para planejarem o que eles pretendem fazer.");
        Thread.sleep(3000);
        // A partir deste momento, as escolhas que você fazer, irá mudar o destino de Cebolinha e Cascão.

        // 1º Divisão de caminhos
        String plano;
        Scanner infalivel = new Scanner(System.in);

        System.out.println("Após pensarem com bastante calma, Cebolinha e Cascão chegam a três opções de possíveis diversões para esse final de semana:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Selecione o melhor plano infalível:");
        System.out.println("Digite (Sansão) para aprontar com o coelhinho da Mônica!");
        System.out.println("Digite (Mônica) para aprontar diretamente com a Mônica!");
        System.out.println("Digite (Magali) para aprontar indiretamente com a Mônica!");

        plano = infalivel.nextLine();
        if (plano.equals("Sansao")) {
            Thread.sleep(3000);
            System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Após uma breve briga, Cebolinha e Cascão decidem serem mais discretos, e preferem aprontar com o Sansão, o coelhinho de pelúcia da Mônica.");
            System.out.println("Certo tempo depois, ficou decidido que o Cebolinha irá usar um disfarce em quanto o Cascão pega o Sansão as escondidas.\n");
            System.out.println("Cebolinha então pega as roupas do seu pai, as veste e os dois vão em direção ao parque.");
            Thread.sleep(4000);
            System.out.println("Chegando no parque, Cebolinha tenta distrair as meninas, porém, o que ele esqueceu, é que Cebolinha não consegue falar palavras o R");
            System.out.println(" Mônica logo desconfiou e já pressentia que algo de errado não estava certo.");
            Thread.sleep(3000);
            System.out.println("Cascão deu o sinal com a mão para Cebolinha, para avisar que já tinha pego o Sansão");
            System.out.println("Desengonçado, Cebolinha sai para o lugar combinado com o Cascão.");
            System.out.println("O que os meninos devem fazer com o Sansão?");
            System.out.println("Digite (Orelhas) para dar um nó, nas orelhas do Sansão.");
            System.out.println("Digite (Caneta) para riscar o rosto do Sansão.");
            plano = infalivel.nextLine();

            //Introduzindo a segunda múltipla escolha
            if(plano.equals("Orelhas")){
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Cebolinha e Cascão decidem dar um nó nas orelhas de Sansão");
                System.out.println("Eles correm até a Casa da Árvore, porém, o problema é que eles não foram cuidadosos, e se quer olharam pra trás.");
                System.out.println("Chegando lá, eles dão um nó com bastante força na orelha do coelhinho, e fazem piadas e deboches daquela situação.");
                System.out.println("Com pouco tempo, Mônica notou a falta de Sansão, e ligou os pontos: era mais um plano infalível do Cebolinha...");
                Thread.sleep(3000);
                System.out.println("Muitas gargalhadas eram ouvidas da Casa da Árvore, mal sabiam que Mônica já estava subindo as escadas discretamente");
                System.out.println("Mônica entra furiosa na casa da árvore. Cebolinha e Cascão congelam de medo.");
                System.out.println("Mal sabiam que o Nó que eles fizeram, encaixou perfeitamente na mão da Mônica e ela deu uma baita surra neles!");
                Thread.sleep(4000);
                System.out.println("Cebolinha e Cascão aprenderam a lição e não irão pegar mais o Sansão!!");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                                        // PRIMEIRO FINAL

            }
                

            else if (plano.equals("Caneta")) {
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Cebolinha e Cascão decidem rabiscar a cara do Sansão com canetinha a base d'agua removível.");
                System.out.println("Eles correm até a Casa da Árvore, porém, o problema é que eles não foram cuidadosos, e se quer olharam pra trás.");
                System.out.println("Chegando na casa da árvore, Cebolinha e Cascão desenham bigodes e sombrancelhas no Sansão, fazem piadas e se divertem da situação");
                Thread.sleep(3000);
                System.out.println("Muitas gargalhadas eram ouvidas da Casa da Árvore, mal sabiam que Mônica já estava subindo as escadas discretamente");
                System.out.println("Mônica entra furiosa na casa da árvore. Cebolinha e Cascão congelam de medo.");
                System.out.println("Mônica furiosa pega Cascão e Cebolinha pela orelha, os leva até o parque, e lá, ela faz com que eles sentem no piquenique com os rostos todos pintados como se fossem maquiagem.");
                Thread.sleep(4000);
                System.out.println("Cebolinha e Cascão aprenderam a lição, e com Canetinha não mais brincarão.");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                                 //  SEGUNDO FINAL
            }
            }
            

        
        else if (plano.equals("Magali")) {
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Cebolinha e Cascão decidem aprontar com a Magali\n");
                Thread.sleep(3000);
                System.out.println("Pensando nisso, os meninos decidem que vão aprontar com a cesta de piquenique, já que a comida é tudo para a Magali");
                System.out.println("Mas para isso, Mônica também precisaria estar distraída, em quanto o outro apronta.");
                System.out.println("O que você pretende fazer com a Magali?");
                System.out.println("Digite (Melancia) para aprontar com a Melância do Piquenique");
                System.out.println("Digite (Cesta) para aprontar com a cesta do piquenique");
                plano = infalivel.nextLine();
                // Introduzindo a segunda múltipla escolha

                if (plano.equals("Melancia")) {
                System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Thread.sleep(3000);
                    System.out.println("Cebolinha e Cascão decidem que vão tentar pegar a melância da cesta, mesmo sabendo que é a fruta favorita da Magali.");
                    System.out.println("O plano ficou decidido que o Cascão iria distrair em quanto o Cebolinha pegava a Melancia.\n");
                    System.out.println("O Cascão chega no piquenique, chama Mônica e Magali para o escorregador com a desculpa que viu algo brilhante por lá");
                    System.out.println("Após insistir bastante, Monica e Magali acompanha Cascão até o escorregador...");
                    Thread.sleep(3000);
                    System.out.println("Em quanto isso, Cebolinha devora a Melancia de Magali.");
                    System.out.println("Quando as meninas chegaram ao escorregador, Cascão saiu correndo, e elas ficaram sem entender, então retornaram ao local.");
                    System.out.println("Cebolinha e Cascão espreitam pra ver a reação de Magali...");
                    Thread.sleep(3000);
                    System.out.println("Eles pensaram que Mônica e Magali iriam ficar furiosas, mas pelo contrário, Magali ficou triste e Mônica ficou consolando sua amiga.");
                    System.out.println("Vendo aquela situação, Cebolinha e Cascão também ficaram tristes. Cebolinha decide que vai ao mercadinho comprar uma fatia de Melancia para devolver a Magali");
                    System.out.println("Cebolinha e Cascão chegam ao piquenique pedindo desculpas, e entregam a melância para Magali");
                    System.out.println("Magali fica feliz, e Mônica fica um pouco emburrada, mas no final das contas, elas convidaram os meninos para lanchar");
                    System.out.println("Eles se juntaram as meninas e tiveram uma tarde divertida e descontraída!");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                             // TERCEIRO FINAL


                }
                else if(plano.equals("Cesta")) {
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Cebolinha e Cascão decidem que vão tentar sabotar a cesta do piquenique com algum bichinho.");
                    System.out.println("O plano ficou decidido que o Cascão iria distrair em quanto o Cebolinha colocava o bichinho na cesta.\n");
                    System.out.println("O Cascão chega no piquenique, chama Mônica e Magali para o escorregador com a desculpa que viu algo brilhante por lá");
                    System.out.println("Em quanto isso, Cebolinha procurava Minhocas e Grilos para por na cesta das meninas.");
                    System.out.println("Após insistir bastante, Monica e Magali acompanha Cascão até o escorregador...");
                    Thread.sleep(3000);
                    System.out.println("Cebolinha vai até a cesta e coloca os bichinhos lá e em seguida, ele se esconde.");
                    System.out.println("Quando as meninas chegaram ao escorregador, Cascão saiu correndo, e elas ficaram sem entender, então retornaram ao local.");
                    System.out.println("Cebolinha e Cascão espreitam pra ver a reação de Magali...");
                    Thread.sleep(3000);
                    System.out.println("Ao chegarem ao local do piquenique, Magali abre a cesta e toma um baita susto!!");
                    System.out.println("De longe os meninos caem na gargalhada!!");
                    Thread.sleep(3000);
                    System.out.println("Mônica corajosa, retirou os bichinhos e se quer desconfiou que fosse um plano armado de Cebolinha e Cascão.\n");
                    System.out.println("Ela mostra a Magali que são bichinhos do bem, e que não vão fazer mal algum! Mônica coloca eles em seus devidos lugares e as meninas voltam para lanchar.");
                    Thread.sleep(3000);
                    System.out.println("Em quanto isso, Cascão e Cebolinha voltam para casa dando risadas e felizes que seu plano deu certo.");
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                           FIM                                                             ");
                             // QUARTO  FINAL

                    }
                 } 
            else if (plano.equalsIgnoreCase("Monica")){
                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    Thread.sleep(3000);
                    System.out.println(" Cebolinha e Cascão decidem ir pelo caminho mais difícil: atentar a Mônica diretamente na pracinha.");
                    System.out.println(" Esse plano infalível não era uma opção muuuito sábia, mas eles decidiram arriscar.");
                    System.out.println(" Então eles planejaram chegar no piquenique, e com uma zarabatana, provocar a Mônica ");
                    System.out.println(" Eles se prepararam com Capacetes e Joelheiras para esse ato, então, eles chegaram correndo no parquinho");
                    System.out.println(" Então eles começam a disparar com a Zarabatanas bolinhas de papel e ao mesmo tempo, chamando a Mônica de Baixinha e Gorducha.");
                    System.out.println(" Monica fica furiosa, ela se prepara com o Sansão, e começa a correr atrás dos meninos");
                    System.out.println(" Magali corre atrás de Mônica para tentar apartar a briga, e eles continuam pra lá e pra cá ");              

                    System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("                                                      FIM                                                                  ");
                     infalivel.close();

                    // QUINTO FINAL
            
                }      
     }         
    
}  

