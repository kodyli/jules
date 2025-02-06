def info(message){
    echo colorize("green", message)
}
/*
steps{
    script{
        log.info("Test");
        log.info "Test"
    }
}
*/
def error(message) {
    echo colorize("red", message)
}
