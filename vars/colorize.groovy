def call(color, message){
    //Jenkins need to install AnsiColor and set 
    //Global color map for all builds
    def colors = [
        "green": '\033[1;32m',  // Bright Green
        "red": '\033[1;31m',    // Bright Red
        "yellow": '\033[1;33m', // Bright Yellow
        "blue": '\033[1;34m',   // Bright Blue
        "reset": '\033[0m'      // Reset color
    ]
    return colors[color]?"${colors[color]}${message}${colors['reset']}" : message;
}