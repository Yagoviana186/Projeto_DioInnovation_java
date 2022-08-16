package me.dio.academia.digital.entity;

import java.time.LocalDateTime;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

  @Id
  @GenerateValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  private LocalDateTime dataDaMatricula = LocalDateTime.now();

  public LocalDateTime getDataDaMatricula() {
    return dataDaMatricula;
  }

  public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
    this.dataDaMatricula = dataDaMatricula;
  }
}
