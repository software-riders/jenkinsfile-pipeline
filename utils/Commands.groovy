class Commands implements Serializable {

    def call(String command) {
        sh command
    }

}