/*Lista de exercicios sobre sintaxe da linguagem Java
*Exercicio 6
*Crie dois vetores de 50 posições com valores inteiros aleatórios, ordene
*cada vetor individualmente, e combine os dois vetores gerando um novo
*vetor de 100 posições, de forma que esse novo vetor já seja criado ordenado.*/

public class Ordenacao {

    //preenche o vetor com número aleatório entre 0 e 1000
    public static void preencheVetorAleat(int[] vetor){
        for(int i = 0; i < 50; i++){
            vetor[i] = (int) (1000 * Math.random());
        }
    }

    //ordena vetor com algoritmo insertion sort
    public static void insertionSort(int[] vetor){
        for (int i = 1; i < vetor.length; i++){
			int elementoAtual = vetor[i];
			int j = i;
			
			while (j > 0 && vetor[j-1] > elementoAtual){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = elementoAtual;
		}
    }

    //combina 2 vetores de mesmo tamanho ordenados 
    public static void combinarVetorOrdenado(int[] vet1, int[] vet2, int[] vet3){
        int i = 0, j = 0, z;
        
        for(z = 0; z < vet3.length; z++){
            if(vet1[i] <= vet2[j]){
                vet3[z] = vet1[i];
                i++;

                //retirar erro de indexacao do último loop
                if(i == vet1.length) i--;
            }
            else{
                vet3[z] = vet2[j];
                j++;

                //retirar erro de indexacao do último loop
                if(j == vet2.length) j--;
            }
        }
    
    }

    public static void imprimirVetor(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){    
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        int[] vetorOrdenado = new int[100];

        //preencher, imprimir, ordenar e imprimir novamente o vetor 1
        preencheVetorAleat(vetor1);
        System.out.println("Vetor 1 antes de ser ordenado: ");
        imprimirVetor(vetor1);
        insertionSort(vetor1);
        System.out.println("Vetor 1 após ser ordenado: ");
        imprimirVetor(vetor1);

        System.out.println("");
        
        //preencher, imprimir, ordenar e imprimir novamente o vetor 2
        preencheVetorAleat(vetor2);
        System.out.println("Vetor 2 antes de ser ordenado: ");
        imprimirVetor(vetor2);
        insertionSort(vetor2);
        System.out.println("Vetor 2 após ser ordenado: ");
        imprimirVetor(vetor2);

        System.out.println("");

        combinarVetorOrdenado(vetor1, vetor2, vetorOrdenado);
        System.out.println("Combinação do vetor 1 e vetor 2 ordenado: ");
        imprimirVetor(vetorOrdenado);

        
    }
}
