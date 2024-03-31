public static void ExibirPedidos(List<Cliente> clientes) {
    private static void ExibirCabecalho() {
        System.out.println("****************************");
        System.out.println("******Total de pedidos******");
        System.out.println("****************************");
    }
    
    private static double CalcularTotalPedidos(Cliente cliente) {
        double totalPedidos = 0;
        for (Pedido pedido : cliente.getPedidos()) {
            totalPedidos += pedido.getValor();
        }
        return totalPedidos;
    }
    
    private static void ExibirTotalPedidos(Cliente cliente, double totalPedidos) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Total = " + totalPedidos);
    }
}
