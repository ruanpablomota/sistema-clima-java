    public class CidadeClima {
    String cidade;
    int temperatura;
    String condicao;

        public CidadeClima(String cidade, int temperatura, String condicao) {
            this.cidade = cidade;
            this.temperatura = temperatura;
            this.condicao = condicao;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public int getTemperatura() {
            return temperatura;
        }

        public void setTemperatura(int temperatura) {
            this.temperatura = temperatura;
        }

        public String getCondicao() {
            return condicao;
        }

        public void setCondicao(String condicao) {
            this.condicao = condicao;
        }
    }
