import { TestBed } from '@angular/core/testing';

import { ServiceTicketsService } from './service-tickets.service';

describe('ServiceTicketsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceTicketsService = TestBed.get(ServiceTicketsService);
    expect(service).toBeTruthy();
  });
});
