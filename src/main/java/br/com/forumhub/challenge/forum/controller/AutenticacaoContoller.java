package br.com.forumhub.challenge.forum.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.forumhub.challenge.forum.infra.security.JWTDados;
import br.com.forumhub.challenge.forum.infra.security.TokenService;
import br.com.forumhub.challenge.forum.model.autenticacao.DTOAutenticacao;
import br.com.forumhub.challenge.forum.model.usuario.UsuarioEntity;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RestController
@RequestMapping("/auth")
public class AutenticacaoContoller {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity efetuarLogin(@RequestBody @Valid DTOAutenticacao autenticacaoDTO) throws UsernameNotFoundException {

        var token = new UsernamePasswordAuthenticationToken(autenticacaoDTO.email(), autenticacaoDTO.password());
        var authentication = authenticationManager.authenticate(token);

        var tokenJWT = tokenService.gerarToken((UsuarioEntity) authentication.getPrincipal());

        return ResponseEntity.ok(new JWTDados(tokenJWT));

    }
}
 