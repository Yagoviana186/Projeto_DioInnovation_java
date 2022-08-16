package me.dio.academia.digital.service.impl;
import org.springframework.stereotype.Service;


@Service
  public class AlunoServiceImpl  implements IAlunoService {

    @Autowired
    private AlunoRepository repository;
    
    
    @Override
    public Aluno create(AlunoForm form) {
      Aluno aluno = new Aluno();
      aluno.setNome(form.getNome());
      aluno.setCpf(form.getCpf());
      aluno.setBairro(form.getBairro());
      aluno.setDataDeNascimento(form.getDataDeNascimento());  
        
         return repository.save(aluno);
        
    }

    @Override
    public Aluno get(Long id) {return null;}
    @Override
    public List<Aluno> getAll() {return  repository.findALL(); } 
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {return null;}

    @Override
    public void delete(Long id){

    } 

    @Override
    public List
 




















  }
    
    
