package rod.spring.learning_fundamentals.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rod.spring.learning_fundamentals.models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
