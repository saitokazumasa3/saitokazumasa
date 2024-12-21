/** @type {import('tailwindcss').Config} */
module.exports = {
    content: ["./src/main/resources/**/*.{html,js}"],
    theme: {
        extend: {
            colors: {
                "primary": "#316785",
                "secondary": "#c6d4e1",
                "interactable": "#5897bd",
                "danger": "#b33939",
            }
        },
        fontSize: {
            "2xl": "8rem",
            "xl": "2rem",
            "lg": "1.8rem",
            "base": "1.2rem",
            "sm": "1rem",
            "xs": "0.8rem"
        },
        fontFamily: {
            serif: ["Noto Serif JP", "serif"],
            sans: ["Noto Sans JP", "sans-serif"]
        },
        letterSpacing: {
            "wide": "1.5rem",
            "wider": "1.75rem",
            "widest": "2rem"
        }
    },
    plugins: [],
}
