package cm.deepdream.academia.programmation.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import cm.deepdream.academia.souscription.data.Etablissement;
@Repository
public interface EtablissementRepository extends CrudRepository<Etablissement, Long>{

}
