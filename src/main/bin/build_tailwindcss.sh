#!/bin/bash

INPUT_CSS_PATH="./src/main/resources/static/css/tailwindcss.css"
OUTPUT_CSS_PATH="./src/main/resources/static/css/tailwindcssout.css"

npx tailwindcss -i $INPUT_CSS_PATH -o $OUTPUT_CSS_PATH
