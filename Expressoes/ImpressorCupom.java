public class ImpressorCupom {
    public void imprimir(Cupom cupom) {

        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        conteudo.append(String.format("%-50s\n", cupom.nomeFantasia));
        Endereco end = cupom.endereco;
        conteudo.append(String.format("%s N. %s %s %s %s-%s\n", end.logradouro, end.numero, end.complemento, end.bairro,
                end.cidade, end.uf));
        conteudo.append(String.format("CPF/CNPJ: %s %s\n", formatarCpfCnpj(cupom.cpf), cupom.data));
        conteudo.append(String.format("IE: %s %s\n", cupom.ie, cupom.hora));
        conteudo.append(String.format("IM: %s CCF: %s\n", cupom.im, cupom.ccf));
        conteudo.append(String.format("CDD: %-50s\n", cupom.cdd));
        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        conteudo.append(String.format("ITEM COD. %-30s%10s\n", "DESCRIÇÃO", "VALOR"));
        for (CupomItem item : cupom.itens) {
            conteudo.append("DESCRICAO DE ACORDO COM CADA ITEM EXISTENTE\n");
        }
        conteudo.append(tracos());
        System.out.println(conteudo.toString());
        // em caso de resolver explorar algumas formas de apresentação
        // return conteudo.toString();
    }

    private String tracos() {
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }

    private String formatarCpfCnpj(String cpfCnpj) {
        String newCnpj = "";
        if (cpfCnpj.length() == 11)
            newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        else
            newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return newCnpj;
    }
}
