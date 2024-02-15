package hashing;

import java.util.HashSet;
import java.util.Set;

public class HashingComPorao implements EstruturaDeDados {
    private Set<Integer> conjunto;

    public HashingComPorao() 
    {
        
        this.conjunto = new HashSet<>();
    }

    @Override
    public void insert(int L) 
    {
        
        conjunto.add(L);
    }

    @Override
    public void delete(int J) 
    {
        conjunto.remove(J);
    }

    @Override
    public boolean search(int K) 
    {
        return conjunto.contains(K);
    }
    
}