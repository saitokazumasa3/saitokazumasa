class FadeOuter {
    #element;

    constructor(element) {
        this.#element = element;
    }

    fadeout(delay, duration) {
        this.#element.animate([
                {opacity: 0}
            ], {
                delay: delay,
                duration: duration,
                fill: "forwards"
            }
        );
    }
}

function initialize() {
    const messageBox = document.getElementById("message-box");
    if (messageBox === null) return;

    const fadeOut = new FadeOuter(messageBox);
    fadeOut.fadeout(2000, 500);
}

document.addEventListener("DOMContentLoaded", () => initialize());
