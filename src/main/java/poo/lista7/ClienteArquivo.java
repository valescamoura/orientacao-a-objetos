package poo.lista7;

import java.io.*;
import java.util.ArrayList;

public class ClienteArquivo {
    private static String nomeArq = "arquivoDeClientes.dat";

    private static boolean arquivoExiste(String nomeDoArq) {
        File file = new File(nomeDoArq);
        if (file.exists()) {
           return true;
        } 
        return false;
    }

    //função que resolveria problemas de sobrescrita, mantive aqui para salvar
    // private static ObjectOutputStream openStream(File f) throws Exception {
    //     ObjectOutputStream oos = null;
    //     if (f.exists()) {
    //        FileOutputStream fos = new FileOutputStream(f, true);
    //        oos = new AppendingObjectOutputStream(fos);
    //     } else {
    //        FileOutputStream fos = new FileOutputStream(f);
    //        oos = new ObjectOutputStream(fos);
    //     }
    //     return oos;
    // }

    public static void inserir(Cliente cliente) throws Exception {
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        if (arquivoExiste(nomeArq)) {
            listaDeClientes = listar();
        }

        listaDeClientes.add(cliente);

        try {
            FileOutputStream file = new FileOutputStream(nomeArq);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            //ObjectOutputStream oos = openStream(file);

            for(Cliente c: listaDeClientes){
                oos.writeObject(c);
            }
            oos.flush();;
            oos.close();
            file.close();
            System.out.println("Cliente cadastrado com sucesso.");
        }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("Não foi possível cadastrar o cliente.");
            e.printStackTrace();
        }
    }

    public static Cliente buscarPorCPF(int cpf){
        Cliente cliente = null, aux = null;

        try {
            FileInputStream file = new FileInputStream(nomeArq);
            ObjectInputStream fileObj = new ObjectInputStream(file);

            do{
                aux = (Cliente) fileObj.readObject();
                if(cpf == aux.getCpf()) {
                    cliente = aux;
                    break;
                }
            } while(aux != null);

            fileObj.close();
            file.close();
            
        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch(EOFException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        return cliente;
    }

    public static ArrayList<Cliente> buscarPorNome(String nome){
        Cliente cliente = null;
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        try {
            FileInputStream file = new FileInputStream(nomeArq);
            ObjectInputStream fileObj = new ObjectInputStream(file);
            
            do{
                cliente = (Cliente) fileObj.readObject();
                if(cliente.getNome().equals(nome)){
                    listaDeClientes.add(cliente);
                }
            } while(cliente != null);
            
            fileObj.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(EOFException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaDeClientes;
    }

    public static ArrayList<Cliente> listar(){
        Cliente cliente = null;
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        try {
            FileInputStream file = new FileInputStream(nomeArq);
            ObjectInputStream fileObj = new ObjectInputStream(file);
            
            do{
                cliente = (Cliente) fileObj.readObject();
                listaDeClientes.add(cliente);
            } while(cliente != null);
            
            fileObj.close();
            file.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(EOFException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaDeClientes;
    }
    
    public static void excluir(int cpf){
        Cliente cliente = null;
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        if (!arquivoExiste(nomeArq)) {
            System.out.println("O arquivo ainda está vazio.");
            return;
        }

        try {
            FileInputStream file = new FileInputStream(nomeArq);
            ObjectInputStream fileObj = new ObjectInputStream(file);
            do{
                cliente = (Cliente) fileObj.readObject();
                if(cliente.getCpf() != cpf){
                    listaDeClientes.add(cliente);
                }
            } while(cliente != null);
            fileObj.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(EOFException e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileOutputStream file = new FileOutputStream(nomeArq);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            for(Cliente c: listaDeClientes){
                oos.writeObject(c);
            }
            oos.flush();;
            oos.close();
            file.close();
            System.out.println("Cliente excluído com sucesso.");
        }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("Não foi possível excluir o cliente.");
            e.printStackTrace();
        }
    }
}
