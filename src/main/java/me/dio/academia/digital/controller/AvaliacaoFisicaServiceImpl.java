import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annovation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvalicaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAluno()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return  AvaliacaoFisicaRepository.save(avaliacaoFisica);

        return null;
    } 

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

   

}