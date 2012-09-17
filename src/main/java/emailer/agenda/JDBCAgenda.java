package emailer.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component("jdbcAgenda")
public class JDBCAgenda implements Agenda {

    @Override
    public void registrar(String nome, String email) {
        System.out.println("Entrou no registrar do JDBCAgenda");
//        Connection conn = null;
//        PreparedStatement stm = null;
//        try {
//            conn = getConnection();
//            stm = conn.prepareStatement("Insert into agenda(nome, email) values (?, ?)");
//            stm.setString(1, nome);
//            stm.setString(2, email);
//            stm.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (stm != null) {
//                    stm.close();
//                }
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection("bla bla bla");
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public String consultar(String nome) {
        System.out.println("Entrou no consultar do JDBCAgenda");
//        Connection conn = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//        try {
//            conn = getConnection();
//            stm = conn.prepareStatement("Select email from agenda where nome = ?");
//            stm.setString(1, nome);
//            rs = stm.executeQuery();
//            while (rs.next()) {
//                return rs.getString("email");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (rs != null) {
//                    rs.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (stm != null) {
//                    stm.close();
//                }
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
        return null;
    }

}
