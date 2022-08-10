#version 150

#moj_import <matrix.glsl>

uniform sampler2D Sampler0;

uniform float GameTime;
uniform int AlteredSightLayers;

in vec4 texProj0;

const mat4 SCALE_TRANSLATE = mat4(
    0.5, 0.0, 0.0, 0.25,
    0.0, 0.5, 0.0, 0.25,
    0.0, 0.0, 1.0, 0.0,
    0.0, 0.0, 0.0, 1.0
);

const vec3[] COLORS = vec3[](
    vec3((39.0/255.0), (39.0/255.0), (39.0/255.0)),
    vec3(0.0, (159.0/255.0), (183.0/255.0)),
    vec3((53.0/255.0), (131.0/255.0), (149.0/255.0)),
    vec3((105/255.0), (103.0/255.0), (115.0/255.0)),
    vec3((180.0/255.0), (159.0/255.0), (109.0/255.0)),
    vec3((254.0/255.0), (215.0/255.0), (102.0/255.0))
);

mat4 basetranslate = mat4(
        1.0, 0.0, 0.0, 1.0,
        0.0, 1.0, 0.0, (GameTime * -30.0),
        (GameTime * 10.0), 0.0, 1.0, 0.0,
        0.0, 0.0, 0.0, 1.0
    );


mat4 altered_sight_layer(float layer) {
    mat4 translate = mat4(
        1.0, 0.0, 0.0, 5.0 / layer,
        0.0, 1.0, 0.0, (2.0 + layer / 1.5) * (GameTime * layer*2.5),
        0.0, 0.0, 1.0, 0.0,
        0.0, 0.0, 0.0, 1.0
    );

    mat2 rotate = mat2_rotate_z(radians((layer * layer * 4321.0 + layer * 9.0) * 2.0));

    mat2 scale = mat2(0.9 + layer/1.5);

    return mat4(scale * rotate) * translate * SCALE_TRANSLATE;
}

out vec4 fragColor;

void main() {
    vec3 color = textureProj(Sampler0, texProj0 * basetranslate).rgb * COLORS[0];
    for (int i = 0; i < AlteredSightLayers; i++) {
        color += textureProj(Sampler0, texProj0 * altered_sight_layer(float(i + 1))).rgb * COLORS[i] * 0.25;
    }
    fragColor = vec4(color, 1.0);
}
