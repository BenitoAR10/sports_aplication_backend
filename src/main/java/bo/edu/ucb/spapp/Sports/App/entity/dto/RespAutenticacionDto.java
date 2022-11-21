package bo.edu.ucb.spapp.Sports.App.entity.dto;

public class RespAutenticacionDto {
    private String token;
    private String refresh;

    public RespAutenticacionDto() {
    }

    public RespAutenticacionDto(String token, String refresh) {
        this.token = token;
        this.refresh = refresh;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    @Override
    public String toString() {
        return "RespAutenticacionDto{" +
                "token='" + token + '\'' +
                ", refresh='" + refresh + '\'' +
                '}';
    }
}
