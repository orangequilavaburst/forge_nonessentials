#version 150

#moj_import <matrix.glsl>

uniform sampler2D Sampler0;

uniform float GameTime;

in vec4 texProj0;

const mat4 SCALE_TRANSLATE = mat4(
    1.0, 0.0, 0.0, 0.0,
    0.0, -1.0, 0.0, 0.0,
    0.0, 0.0, 1.0, 0.0,
    0.0, 0.0, 0.0, 1.0
);

out vec4 fragColor;

void main() {
    vec3 color = textureProj(Sampler0, texProj0 * SCALE_TRANSLATE).rgb;
    fragColor = vec4(color, 1.0);
}
