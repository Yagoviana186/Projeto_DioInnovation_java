package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties ({"hibernateLazyInitializer", "handler"})
public class Aluno {

  @Id
  @GenerateValue(strategy = GenerationType.IDENTITY)
  
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  @Column(unique = true)
  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  private String bairro;

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  private LocalDate dataDeNascimento;

  public LocalDate getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(LocalDate dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }


  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

  public List<AvaliacaoFisica> getAvaliacoes() {
    return avaliacoes;
  }

  public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
    this.avaliacoes = avaliacoes;
  }

}
