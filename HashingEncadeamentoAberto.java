package hashing;

import java.util.ArrayList;
import java.util.List;

public class HashingEncadeamentoAberto implements EstruturaDeDados {
    
    private List<Integer>[] tabela;
    private int tam;

    @SuppressWarnings("unchecked")
    public HashingEncadeamentoAberto() 
    {
        this.tam = 1000;
        this.tabela = new ArrayList[tam];
    }

    @Override
    public void insert(int L)
    {
        int ind = hash(L);
        
        if (tabela[ind] == null)
        {
            tabela[ind] = new ArrayList<>();
        }

        tabela[ind].add(L);
    }

    @Override
    public void delete(int j) 
    {
        int ind = hash(j);

        if (tabela[ind] != null) 
        {
            tabela[ind].remove(Integer.valueOf(j));
        }
    }

    @Override
    public boolean search(int c)
    {
        int ind = hash(c);

        if (tabela[ind] != null)
        {
            return tabela[ind].contains(c);
        }

        return false;
    }

    private int hash(int h)
    {
        return h % tam;
    }
}