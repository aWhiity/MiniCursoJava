package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import entities.Aluno;

public class AlunoDAO {

	private Connection conn;

	public AlunoDAO(Connection conn) {

		this.conn = conn;
	}

	public void cadastrar(Aluno aluno) throws SQLException {
		
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("insert into aluno(registro_academico, nome, curso, sexo) values (?, ?, ?, ?)");
			st.setInt(1, aluno.getRa());
			st.setString(2, aluno.getNome());
			st.setString(3, aluno.getCurso());
			st.setString(4, aluno.getSexo());
			st.executeUpdate();
			
		} finally {
			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
		
	}

	public List<Aluno> buscarTodos() throws SQLException {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			
			st = conn.prepareStatement("select * from aluno order by nome");
			rs = st.executeQuery();
			
			List<Aluno> alunos = new ArrayList<>();
			
			while(rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setRa(rs.getInt("registro_academico"));
				aluno.setNome(rs.getString("nome"));
				aluno.setCurso(rs.getString("curso"));
				aluno.setSexo(rs.getString("sexo"));
				
				alunos.add(aluno);
			}
			
			return alunos;
			
		} finally {
			BancoDados.finalizarStatement(st);
			BancoDados.finalizarResultSet(rs);
			BancoDados.desconectar();
		}
	}

	public void atualizar(Aluno aluno) throws SQLException {

		
	}

	public int excluir(int ra) throws SQLException {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("delete from aluno where registro_academico = ?");
			st.setInt(1, ra);
			
			int linhasModificadas = st.executeUpdate();
			
			return linhasModificadas;
		} finally {
			BancoDados.finalizarStatement(st);
			BancoDados.desconectar();
		}
	}
}
