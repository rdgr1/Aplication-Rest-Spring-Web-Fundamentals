package rod.spring.learning_fundamentals.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rod.spring.learning_fundamentals.models.ProdutoModel;
import rod.spring.learning_fundamentals.repositories.ProdutoRepository;

import java.util.List;
@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel save(ProdutoModel produtoModel){
        if (produtoModel.getNome() == null)
            throw new ProdutoNullException();
        return  produtoRepository.save(produtoModel);
    }
    public ProdutoModel findById(Long id){
        return produtoRepository.findById(id).orElse(null);
    }
    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }
}
